import geb.Page

class DLab extends Page {

    static url = "https://projectby.trainings.dlabanalytics.com/havdeeva89/"

    static at = {
        waitFor(30) { title == "Log in to dlab" }
    }

    static content = {
        epamSSOButton { $("a#zocial-epam-idp.zocial.saml") }
    }

}
