package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* renamed from: gr0  reason: default package */
public final class gr0 extends cr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    public final void b(View view) {
        int i = this.a;
    }

    public final void c(View view, int i) {
        switch (this.a) {
            case 0:
                if (i == 5) {
                    ((ir0) this.b).cancel();
                    return;
                }
                return;
            default:
                if (i == 5) {
                    ((BottomSheetDialogFragment) this.b).l1();
                    return;
                }
                return;
        }
    }
}
