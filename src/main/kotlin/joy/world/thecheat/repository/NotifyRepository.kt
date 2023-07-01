package joy.world.thecheat.repository

import joy.world.thecheat.entity.NotifyEntity
import joy.world.thecheat.entity.QNotifyEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport

interface NotifyRepoCustom {

}

interface NotifyRepository : JpaRepository<NotifyEntity, Long>, NotifyRepoCustom

class NotifyRepoCustomImpl : QuerydslRepositorySupport(NotifyEntity::class.java), NotifyRepoCustom {
    private val table = QNotifyEntity.notifyEntity

}