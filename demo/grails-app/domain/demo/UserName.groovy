package demo

class UserName {

    String username
    String password

    static hasMany = [accounts: Account]

    static constraints = {
        username blank:false,nullable:false,maxSize:24
        password blank:false,nullable:false,minSize:6,maxSize:24
    }
}
