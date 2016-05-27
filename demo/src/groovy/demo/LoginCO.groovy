package demo

import grails.validation.Validateable

/**
 * Created by a on 19-05-2016.
 */
@Validateable
class LoginCO {

    String username
    String password
    String confirmPassword

    static constraints = {
        username blank: false, nullable: false, maxSize: 24,validator: {val,obj->

            UserName.withTransaction {
                UserName username = UserName.findByUsername(val)
                if(username){
                   return "user.already.exists"

                }

            }
        }
        password blank: false, nullable: false, minSize: 6, maxSize: 24
        confirmPassword blank: false, nullable: false, minSize: 6, maxSize: 24, validator: { val, obj ->
            if (val != obj.password)
                 return 'validation.values.unmatched'
        }

    }
}
