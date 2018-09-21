package edu.ka.gradle.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class PrintHostTask extends DefaultTask {
    String ip
    String hName

    @TaskAction
    void printHost() {
        println "In print host task. Host: ${hName}, IP: ${ip}"
    }
}