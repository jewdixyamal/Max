package one.me.android.deeplink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/android/deeplink/NewWidgetActivity;", "Lq5;", "Lnmc;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class NewWidgetActivity extends q5 implements nmc {
    public static final /* synthetic */ int V0 = 0;
    public znc U0;

    public final String Z() {
        return null;
    }

    public final void d0() {
    }

    public final znc g() {
        znc znc = this.U0;
        if (znc != null) {
            return znc;
        }
        return null;
    }

    public final boolean h() {
        return false;
    }

    public final boolean h0() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        w12 b = s36.b(this);
        b.setId(kvb.root);
        setContentView((View) b);
        qu4.a(this);
        super.onCreate(bundle);
        znc c = mr0.c(this, b, bundle);
        c.e = 1;
        c.Q(false);
        this.U0 = c;
        y8a.a.o().g(new zja(this, 14, a14.s(this)));
        a14.M(this, (Intent) null);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a14.e(a14.s(this), intent);
        y8a.a.o().g(new zja(this, 13, intent));
        a14.M(this, intent);
    }
}
