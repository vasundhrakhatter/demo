package demo

import grails.transaction.Transactional

@Transactional
class BalanceService {

    //shows balance of corresponding account
    def balanceAmount(Map params){
        //finds account object with corresponding id
        Account accountList=Account.findById(params.num)
        return accountList
    }


}
