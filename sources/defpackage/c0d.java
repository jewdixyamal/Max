package defpackage;

import android.database.Cursor;

/* renamed from: c0d  reason: default package */
public final class c0d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0d b;

    public /* synthetic */ c0d(o0d o0d, int i) {
        this.a = i;
        this.b = o0d;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                h04 h04 = this.b.mSuggestionsAdapter;
                if (h04 instanceof qce) {
                    h04.b((Cursor) null);
                    return;
                }
                return;
            default:
                this.b.updateFocusedState();
                return;
        }
    }
}
