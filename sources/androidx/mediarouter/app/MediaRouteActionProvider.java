package androidx.mediarouter.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider extends k7 {
    public final eh8 b;
    public final wg8 c = wg8.c;
    public final ag8 d = ag8.a;
    public of8 e;

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.b = eh8.d(context);
        new WeakReference(this);
    }

    public final boolean b() {
        wg8 wg8 = this.c;
        this.b.getClass();
        return eh8.e(wg8);
    }

    public final View c() {
        of8 of8 = new of8(this.a);
        this.e = of8;
        of8.setCheatSheetEnabled(true);
        this.e.setRouteSelector(this.c);
        this.e.setAlwaysVisible(false);
        this.e.setDialogFactory(this.d);
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.e;
    }

    public final boolean e() {
        of8 of8 = this.e;
        if (of8 != null) {
            return of8.d();
        }
        return false;
    }

    public final boolean g() {
        return true;
    }
}
