package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: no7  reason: default package */
public final class no7 implements g2a {
    public final wmc a;
    public boolean b = false;

    public no7(rgg rgg, wmc wmc) {
        this.a = wmc;
    }

    public final void a(Object obj) {
        wmc wmc = this.a;
        wmc.getClass();
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) wmc.a;
        signInHubActivity.setResult(signInHubActivity.M0, signInHubActivity.N0);
        signInHubActivity.finish();
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
