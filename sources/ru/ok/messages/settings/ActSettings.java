package ru.ok.messages.settings;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import ru.ok.messages.settings.caching.FrgCachingSettings;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class ActSettings extends q5 implements jgd, nwe, tsd {
    public static final /* synthetic */ int V0 = 0;
    public ai3 U0;

    public final boolean D() {
        return true;
    }

    public final void M(int i) {
        finish();
        overridePendingTransition(0, 0);
    }

    public final void O() {
    }

    public final String Z() {
        return null;
    }

    public final ai3 a() {
        return this.U0;
    }

    public final void a0() {
        f0(this.N0.L);
    }

    public final void onCreate(Bundle bundle) {
        a aVar;
        super.onCreate(bundle);
        setContentView(yyb.act_settings);
        sme sme = this.N0;
        f0(sme.L);
        go9 go9 = new go9(new y7g((im) this), (Toolbar) findViewById(xxb.toolbar));
        go9.c = sme;
        ai3 ai3 = new ai3(go9);
        this.U0 = ai3;
        int i = gpc.k;
        int i2 = ((sme) ai3.c).w;
        Toolbar toolbar = (Toolbar) ai3.b;
        if (toolbar != null) {
            toolbar.setNavigationIcon(i);
            Drawable navigationIcon = toolbar.getNavigationIcon();
            if (navigationIcon != null) {
                ngg.G(navigationIcon, i2);
            }
        }
        ai3 ai32 = this.U0;
        c5 c5Var = new c5(4, (Object) this);
        Toolbar toolbar2 = (Toolbar) ai32.b;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(c5Var);
        }
        ((SlideOutLayout) findViewById(xxb.act_settings__slideout)).setSlideOutListener(this);
        if (bundle == null) {
            int intExtra = getIntent().getIntExtra("ru.ok.tamtam.extra.SETTING_ID", 0);
            if (intExtra == xxb.setting_media) {
                aVar = new FrgMediaSettings();
            } else if (intExtra == xxb.setting_messages) {
                aVar = new FrgMessagesSettings();
            } else if (intExtra == xxb.setting_privacy_live_location) {
                aVar = new FrgLiveLocationSettings();
            } else if (intExtra == 0 || intExtra == xxb.setting_media_caching) {
                aVar = new FrgCachingSettings();
            } else {
                throw new IllegalArgumentException(wg0.g(intExtra, "Fragment for setting id: ", " not found!"));
            }
            n16 S = S();
            S.getClass();
            he0 he0 = new he0(S);
            int i3 = xxb.act_settings__container;
            if (i3 != 0) {
                he0.f(i3, aVar, "ru.ok.messages.settings.FrgBaseSettings", 2);
                c cVar = aVar.F0;
                if (cVar == null || cVar == he0.q) {
                    he0.b(new v16(8, aVar));
                    he0.d(false);
                    return;
                }
                throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
            }
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
    }

    public final void q() {
    }
}
