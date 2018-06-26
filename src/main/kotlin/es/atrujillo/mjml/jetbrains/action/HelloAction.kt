package es.atrujillo.mjml.jetbrains.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloAction : AnAction("Hello") {

    override fun actionPerformed(e: AnActionEvent?) {
        val project = e?.project
        Messages.showMessageDialog(project, "Hello MJML!", "Greetings", Messages.getInformationIcon())
    }
}