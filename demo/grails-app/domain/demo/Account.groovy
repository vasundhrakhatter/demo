package demo

class Account {

    int number
    static belongsTo = [user : UserName]
    Balance balance
    static constraints = {
        number size:[5..10], nullable:false, blank:false
    }
}
