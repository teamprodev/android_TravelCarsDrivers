package uz.qwerty.travelcarsdrivers.presentation.ui.state


/**
 * Created by Abdurashidov Shahzod on 23/12/21 17:32.
 * company
 * shahzod9933@gmail.com
 */
sealed class ViewState
data class Success<T>(val data: T?) : ViewState()
object Initial : ViewState()
object Loading : ViewState()
object Connect : ViewState()
object Empty : ViewState()
data class ServerError(val errorMessage: String, val code: Int) : ViewState()
data class Fail(val exception: Exception) : ViewState() {

    companion object {
        var networkEvent: NetworkEvent? = null
    }

    init {
        networkEvent?.onError(exception)
    }
}

interface NetworkEvent {
    fun onError(e: java.lang.Exception)
}