package demo

import static org.grails.datastore.mapping.query.Projections.property

class LoginController {

    def loginService

    def login(LoginCO loginCo) {
        println "*********************" + loginCo.properties

        if (loginCo.validate()) {
            UserName user = new UserName(username: loginCo.username, password: loginCo.password)
            UserName user1 = user.save(flush: true, failOnError: true)
            if (user1) {
                println 'user created'
                render g.message(code:  'user.successfully.created',args: ['thrice'])
            }
        } else {

            render view: "/demo/UserName",model: [loginCO: loginCo]
        }
    }

    def signIn(){
        LoginCO loginCO = new LoginCO()
        render(view:"/demo/signIn",model: [loginCO: loginCO])
    }

    //after login
    def welcome(){
        //user is returned from service
        UserName username = loginService.checkUserValidation(params)
        if(username){
            redirect(controller: 'account',action: 'accountList', params: [username:username.username,id: username.id])
        }
        else {
            render 'Please enter valid details'
        }
    }


def index() {
    LoginCO loginCO = new LoginCO()
    render(template: "/demo/commonForm", model: [loginCO: loginCO])
}


}
