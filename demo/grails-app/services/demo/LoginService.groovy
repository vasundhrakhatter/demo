package demo

import grails.transaction.Transactional

@Transactional
class LoginService {
    //username and password received as parameters
    def checkUserValidation(Map params){
        //verifies from database
        def result=UserName.createCriteria().list {
            eq('username',params.username)
            eq('password',params.password)
        }
        if (!result){
            return null
        }
        else{
            //returns user
            return result[0]
        }
    }
}

