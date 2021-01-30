package index

import app.*
import kotlinext.js.*
import kotlinx.browser.document
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        app()
    }
}
