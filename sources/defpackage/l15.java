package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: l15  reason: default package */
public final class l15 {
    public final /* synthetic */ m15 a;

    public l15(m15 m15) {
        this.a = m15;
    }

    public final void a(TextInputLayout textInputLayout) {
        m15 m15 = this.a;
        if (m15.G0 != textInputLayout.getEditText()) {
            EditText editText = m15.G0;
            k15 k15 = m15.J0;
            if (editText != null) {
                editText.removeTextChangedListener(k15);
                if (m15.G0.getOnFocusChangeListener() == m15.b().e()) {
                    m15.G0.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            m15.G0 = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(k15);
            }
            m15.b().m(m15.G0);
            m15.j(m15.b());
        }
    }
}
