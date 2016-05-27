<g:form controller="login" action="login">
    <g:textField name="username" />
    <g:fieldError bean="${loginCO}"  field="username"/>
    <g:passwordField name="password" />
    <g:fieldError bean="${loginCO}"  field="password"/>
    <g:passwordField name=" confirmPassword"/>
    <g:fieldError bean="${loginCO}"  field="confirmPassword"/>
    <g:submitButton name="submit"/>
</g:form>