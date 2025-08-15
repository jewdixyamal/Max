package defpackage;

import android.text.Editable;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.chip.Chip;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.chats.picker.AbstractPickerScreen;

/* renamed from: f9a  reason: default package */
public final class f9a extends TextKeyListener {
    public final /* synthetic */ g9a a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f9a(g9a g9a) {
        super(TextKeyListener.Capitalize.NONE, false);
        this.a = g9a;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (i == 67) {
            g9a g9a = this.a;
            if (g9a.getEditText().getText().length() == 0) {
                LinkedHashMap linkedHashMap = g9a.D0;
                if (!linkedHashMap.isEmpty()) {
                    Map.Entry entry = (Map.Entry) x53.o0(linkedHashMap.entrySet());
                    if (((Chip) entry.getValue()).isChecked()) {
                        e9a callback = g9a.getCallback();
                        if (callback != null) {
                            ((AbstractPickerScreen) ((ph4) callback).a).v0().q(((Number) entry.getKey()).longValue(), (fza) null);
                        }
                        g9a.c(((Number) entry.getKey()).longValue());
                    } else {
                        ((Chip) entry.getValue()).setChecked(true);
                    }
                    return true;
                }
            }
        }
        return super.onKeyDown(view, editable, i, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return true;
    }
}
