import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun OutlineLoginform(
    label: String,
    icon: ImageVector,
    contentDescription: String,
    //modifier: Modifier = Modifier,
    isPassword: Boolean = false
) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it},
        label = { Text(label) },
        leadingIcon = { Icon(imageVector = icon, contentDescription = contentDescription) },
        modifier = Modifier.fillMaxWidth(),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None
        /*trailingIcon = {
            Icon(imageVector = icon, contentDescription = contentDescription) */
    )
}
