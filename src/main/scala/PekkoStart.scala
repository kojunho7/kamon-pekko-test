import kamon.Kamon
import org.apache.pekko.actor.typed.scaladsl.Behaviors
import org.apache.pekko.actor.typed.{ActorSystem, Behavior}

object PekkoStart extends App {

  Kamon.init()

  val actorSystem = ActorSystem(Actor(), "ActorSystem")
}

object Actor {
  def apply(): Behavior[_] =
    Behaviors.setup { context =>
      Behaviors.receiveMessage { message =>
        Behaviors.ignore
      }
    }
}
