package defpackage;

import android.content.Context;
import kotlinx.coroutines.internal.ContextScope;
import me.leolin.shortcutbadger.ShortcutBadger;

/* renamed from: zf0  reason: default package */
public final class zf0 implements qu7 {
    public final Context a;
    public final iy2 b;
    public final ci0 c;
    public final ContextScope o;

    public zf0(Context context, iy2 iy2, ci0 ci0, kke kke, ox3 ox3) {
        this.a = context;
        this.b = iy2;
        this.c = ci0;
        this.o = j1e.a(((w9a) kke).a().limitedParallelism(1, "badge-count").plus(ox3));
    }

    public final void a() {
        ShortcutBadger.removeCount(this.a);
    }
}
