package joy.world.thecheat.repository

import joy.world.thecheat.entity.QTricksterEntity
import joy.world.thecheat.entity.TricksterEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

interface TricksterRepoCustom {

}
interface TricksterRepository:JpaRepository<TricksterEntity,Long>,TricksterRepoCustom {
}

class TricksterRepoCustomImpl:QuerydslRepositorySupport(TricksterEntity::class.java),TricksterRepoCustom{
    private val table = QTricksterEntity.tricksterEntity
}