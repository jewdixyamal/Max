package ru.ok.messages.views;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

public class ActProfilePhoto extends r5 implements b56, nwe {
    public static final /* synthetic */ int Y0 = 0;
    public View V0;
    public ai3 W0;
    public tg X0;

    public final String Z() {
        return null;
    }

    public final ai3 a() {
        return this.W0;
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        if (z) {
            g0((View.OnSystemUiVisibilityChangeListener) null);
        } else {
            b0((View.OnSystemUiVisibilityChangeListener) null);
        }
        this.V0.setVisibility(z ? 0 : 4);
        if (z) {
            this.X0.e((Toolbar) this.W0.b);
        } else {
            this.X0.o((Toolbar) this.W0.b);
        }
    }

    public final void e() {
        c(((Toolbar) this.W0.b).getVisibility() != 0, true, false);
    }

    public final boolean f() {
        return ((Toolbar) this.W0.b).getVisibility() == 0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.X0 = ((y8a) ((ed3) this.K0.b)).c();
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.W0 = j0(yyb.act_profile_photo);
        g0((View.OnSystemUiVisibilityChangeListener) null);
        int i = epc.b;
        f0(getResources().getColor(i));
        getWindow().setNavigationBarColor(getResources().getColor(i));
        ai3 ai3 = this.W0;
        xw0 xw0 = new xw0(14);
        Toolbar toolbar = (Toolbar) ai3.b;
        if (toolbar != null) {
            toolbar.setOnMenuItemClickListener(xw0);
        }
        Toolbar toolbar2 = (Toolbar) this.W0.b;
        if (toolbar2 != null) {
            toolbar2.setBackgroundResource(i);
        }
        ai3 ai32 = this.W0;
        Drawable u = ngg.u(gpc.k, -1, this);
        Toolbar toolbar3 = (Toolbar) ai32.b;
        if (toolbar3 != null) {
            toolbar3.setNavigationIcon(u);
        }
        ai3 ai33 = this.W0;
        c5 c5Var = new c5(3, (Object) this);
        Toolbar toolbar4 = (Toolbar) ai33.b;
        if (toolbar4 != null) {
            toolbar4.setNavigationOnClickListener(c5Var);
        }
        TextView textView = (TextView) this.W0.o;
        if (textView != null) {
            textView.setTextColor(-1);
        }
        this.W0.h();
        Drawable navigationIcon = ((Toolbar) this.W0.b).getNavigationIcon();
        if (navigationIcon != null) {
            ngg.G(navigationIcon, -1);
        }
        ai3 ai34 = this.W0;
        Drawable u2 = ngg.u(gpc.R, -1, this);
        Toolbar toolbar5 = (Toolbar) ai34.b;
        if (toolbar5 != null) {
            toolbar5.setOverflowIcon(u2);
        }
        if (bundle == null) {
            e6 e6Var = (e6) getIntent().getParcelableExtra("ru.ok.tamtam.extra.PHOTO_HOLDER");
            du8 du8 = (du8) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_CONTROL_MESSAGE_DB");
            if (e6Var != null) {
                FrgProfilePhoto frgProfilePhoto = new FrgProfilePhoto();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("ru.ok.tamtam.extra.CONTENT_HOLDER", e6Var);
                if (du8 != null) {
                    bundle2.putParcelable("ru.ok.tamtam.extra.EXTRA_CONTROL_MSG_DB_PARC", du8);
                }
                frgProfilePhoto.X0(bundle2);
                dy7.e(S(), xxb.act_profile_photo__container, frgProfilePhoto, "ru.ok.messages.views.fragments.FrgProfilePhoto");
            } else {
                throw new IllegalArgumentException("PhotoContentHolder must be non null");
            }
        }
        this.V0 = findViewById(xxb.act_profile_photo__vw_top_bg);
        this.V0.getLayoutParams().height = fk4.a(this) * 2;
    }

    public final void onResume() {
        super.onResume();
        an9 m = ((y8a) ((ed3) this.K0.b)).m();
        wuc wuc = wuc.AVATAR_VIEWER;
        spa spa = spa.f;
        m.f(wuc, spa.f);
    }

    public final sme u() {
        return ee4.e0;
    }
}
