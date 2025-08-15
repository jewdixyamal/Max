package defpackage;

import com.google.android.material.chip.Chip;
import one.me.chats.picker.AbstractPickerScreen;

/* renamed from: d9a  reason: default package */
public final /* synthetic */ class d9a implements k56 {
    public final /* synthetic */ g9a a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Chip c;

    public /* synthetic */ d9a(g9a g9a, long j, Chip chip) {
        this.a = g9a;
        this.b = j;
        this.c = chip;
    }

    public final Object invoke() {
        g9a g9a = this.a;
        e9a e9a = g9a.z0;
        if (e9a != null) {
            ((AbstractPickerScreen) ((ph4) e9a).a).v0().q(this.b, (fza) null);
        }
        g9a.removeView(this.c);
        return e5f.a;
    }
}
