package demo

import grails.transaction.Transactional

@Transactional
class AccountService {
    private java.util.List<demo.Account> account

    def accList(Map params){
      //username and id as params
      //Dynamnic finder for getting all accounts with given user_id
      List<Account> account = Account.findAllByUser(UserName.get(params.id as Long))
      return account
    }

    def findBalance(Map params){
        List<Account> account=Account.findAllByNumber(params.num)
        println account
        return account
    }
}
