package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: se5  reason: default package */
public final class se5 extends oyc implements qe5, w7d {
    public je7 i;

    public final void a() {
        je7 je7 = this.i;
        eic eic = je7 instanceof eic ? (eic) je7 : null;
        if (eic != null) {
            eic.reset();
        }
    }

    public final boolean p() {
        return n(PmsKey.f23chatinvitelinkpermissionsenabled, false);
    }

    public final boolean q() {
        return n(PmsKey.gcas, false);
    }

    public final boolean r() {
        return n(PmsKey.gce, false);
    }

    public final boolean s() {
        return n(PmsKey.lgce, false);
    }

    public final boolean t() {
        return n(PmsKey.f92newadminpermissions, false);
    }

    public final boolean u() {
        return n(PmsKey.f20chatanim, false);
    }

    public final boolean v() {
        return n(PmsKey.f129videomsgenabled, false);
    }

    public final boolean w() {
        return n(PmsKey.f135webmstickersenabled, true);
    }
}
