package defpackage;

import android.accounts.Account;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: s04  reason: default package */
public final class s04 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public void a() {
        if (!this.c) {
            this.c = true;
            TabLayout tabLayout = (TabLayout) this.d;
            mg6 mg6 = new mg6(tabLayout, 1);
            ViewPager2 viewPager2 = (ViewPager2) this.e;
            viewPager2.b(mg6);
            this.h = mg6;
            r04 r04 = new r04(viewPager2, this.a, this.b);
            tabLayout.a(r04);
            this.i = r04;
            tabLayout.q(viewPager2.getCurrentItem(), 0.0f, true, true, true);
            k56 k56 = (k56) this.f;
            if (k56 != null) {
                k56.invoke();
            }
        }
    }

    public GoogleSignInOptions b() {
        Scope scope = GoogleSignInOptions.y0;
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.x0;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (this.c && (((Account) this.f) == null || !hashSet.isEmpty())) {
            ((HashSet) this.d).add(GoogleSignInOptions.w0);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) this.f, this.c, this.a, this.b, (String) this.e, (String) this.g, (HashMap) this.h, (String) this.i);
    }

    public void c() {
        if (this.c) {
            r04 r04 = (r04) this.i;
            if (r04 != null) {
                ((TabLayout) this.d).l(r04);
            }
            this.i = null;
            mg6 mg6 = (mg6) this.h;
            if (mg6 != null) {
                ((ViewPager2) this.e).g(mg6);
            }
            this.h = null;
            this.c = false;
            k56 k56 = (k56) this.g;
            if (k56 != null) {
                k56.invoke();
            }
        }
    }
}
