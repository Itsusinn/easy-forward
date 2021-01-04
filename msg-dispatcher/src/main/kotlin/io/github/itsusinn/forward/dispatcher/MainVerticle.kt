package io.github.itsusinn.forward.dispatcher

import io.github.itsusinn.extension.logger
import io.vertx.core.AbstractVerticle
import io.vertx.core.DeploymentOptions
import io.vertx.core.Promise
import io.vertx.core.http.HttpServerOptions

class MainVerticle: AbstractVerticle() {
   override fun start(startPromise: Promise<Void>) {
      vertx
         .deployVerticle(
            DispatcherVerticle::class.java.name,
            DeploymentOptions().setInstances(3)
         )
      logger.info("Server has started!")
   }
}