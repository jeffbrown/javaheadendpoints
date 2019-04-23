package demo.v1

class ApiController {
    static namespace = 'v1'

    def myaction() {
        render 'This request was handled by version 1 of the api'
    }
}
