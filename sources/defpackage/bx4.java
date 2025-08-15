package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: bx4  reason: default package */
public final class bx4 {
    public final qz7 a;
    public int b = Integer.MAX_VALUE;
    public int c = 0;

    public bx4(EditText editText, boolean z) {
        c54.o(editText, "editText cannot be null");
        this.a = new qz7(editText, z);
    }

    public final ix4 a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        qz7 qz7 = this.a;
        qz7.getClass();
        if (!(inputConnection instanceof ix4)) {
            inputConnection = new ix4((EditText) qz7.b, inputConnection, editorInfo);
        }
        return (ix4) inputConnection;
    }
}
