package co.uk.patrickpowell.blackboxtestingthenetworklayer

interface UserRepository {
    suspend fun get(): Result<User>
}