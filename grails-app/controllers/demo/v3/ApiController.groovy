package demo.v3

class ApiController {
    static namespace = 'v3'

    def myaction() {
        render 'This request was handled by version 3 of the api'
    }
}
