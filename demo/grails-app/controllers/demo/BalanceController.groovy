package demo

class BalanceController {
    def balanceService

    //receives selected account id
    def index() {
        Account result=balanceService.balanceAmount(params)
        render view: "/demo/balance", model: [result:result]
    }

    def withdraw(){
        def result=balanceService.withdrawAmount(params)
    }
}
