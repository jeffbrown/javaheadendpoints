package demo.v2

class ApiController {
    static namespace = 'v2'

    def myaction() {
        render 'This request was handled by version 2 of the api'
    }
}
