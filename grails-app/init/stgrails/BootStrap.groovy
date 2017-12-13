package stgrails

import com.stg.*
import br.com.stgenerator.util.*

class BootStrap {

    def init = { servletContext ->
        if(!User.findByUsername("psergiopoli@gmail.com")){
            println "Inicializando dados no banco"
            Role roleAdmin = new Role()
            roleAdmin.setAuthority("ADMIN")
            roleAdmin.save(flush:true,failOnError: true)

            Role roleGuest = new Role()
            roleGuest.setAuthority("GUEST")
            roleGuest.save(flush:true,failOnError: true)

            User admin = new User()
            admin.setUsername("psergiopoli@gmail.com")
            admin.setPassword("h4ck3rlnx")
            admin.save(flush:true,failOnError: true)//flush true nao necessario para recuperar ID

            UserRole userRole = new UserRole()
            userRole.setUser(admin)
            userRole.setRole(roleAdmin)
            userRole.save(failOnError: true)
        }else{
            println "Banco ja inicializado, iniciando app"
        }
    }
    def destroy = {
    }
}
