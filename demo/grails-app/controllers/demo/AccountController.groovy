package demo

class AccountController {
    def accountService

    //for printing accountLists associated with User
    def accountList(params){
        //username and id received as params
        def account= accountService.accList(params)
        //List of accounts is sent to Homepage
        render view: "../demo/HomePage",model: [list:account]
    }

}
