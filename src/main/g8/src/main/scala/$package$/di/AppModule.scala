package $package$.di

import com.mysterria.lioqu.di.LioquModule
import com.mysterria.lioqu.di.AppModule

@AppModule
class $name;format="Camel"$Module extends LioquModule {
  override def configure(): Unit = {
    // Define your services, repositories and install other modules here
  }
}

