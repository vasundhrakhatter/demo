package demo

class Balance {

    int savingsBalance

    static belongsTo= [acc:Account]

    static constraints = {
        savingsBalance blank:false
    }
}
