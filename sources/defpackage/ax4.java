package defpackage;

/* renamed from: ax4  reason: default package */
public abstract class ax4 extends hi {
    public dz4 v0;

    public final boolean onTextContextMenuItem(int i) {
        return i == 16908322 ? super.onTextContextMenuItem(16908337) : super.onTextContextMenuItem(i);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, dz4, android.text.TextWatcher] */
    public void setReplaceTextSmiles(boolean z) {
        if (!z) {
            dz4 dz4 = this.v0;
            if (dz4 != null) {
                removeTextChangedListener(dz4);
                this.v0 = null;
            }
        } else if (this.v0 == null) {
            ? obj = new Object();
            this.v0 = obj;
            addTextChangedListener(obj);
        }
    }
}
