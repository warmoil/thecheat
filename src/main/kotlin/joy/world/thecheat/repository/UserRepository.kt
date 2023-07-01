package joy.world.thecheat.repository

import joy.world.thecheat.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

interface UserRepoCustom {
}

interface UserRepository : JpaRepository<UserEntity, Long>, UserRepoCustom {

}

class UserRepoCustomImpl : QuerydslRepositorySupport(UserEntity::class.java), UserRepoCustom {


}