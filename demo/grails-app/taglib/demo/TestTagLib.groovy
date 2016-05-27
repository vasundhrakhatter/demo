package demo

class TestTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def makeLink={attrs->
        List<Account> list=attrs.parameter
        list.eachWithIndex {it,i->
            out<<"Account Number ${i} : ${it.number}"

        }
    }
}
