package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* renamed from: ix4  reason: default package */
public final class ix4 extends InputConnectionWrapper {
    public final TextView a;
    public final qx7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ix4(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        qx7 qx7 = new qx7(10);
        int i = 0;
        this.a = textView;
        this.b = qx7;
        if (vw4.p != null) {
            vw4 a2 = vw4.a();
            if (a2.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                rw4 rw4 = a2.e;
                rw4.getClass();
                Bundle bundle = editorInfo.extras;
                m99 m99 = ((t99) rw4.c).a;
                int a3 = m99.a(4);
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) m99.o).getInt(a3 + m99.a) : i);
                editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", ((vw4) rw4.a).h);
            }
        }
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return qx7.j(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return qx7.j(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
