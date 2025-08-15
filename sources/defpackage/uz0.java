package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

/* renamed from: uz0  reason: default package */
public final class uz0 implements ConversationFeatureManager.FeatureListener {
    public final /* synthetic */ yz0 a;

    public uz0(yz0 yz0) {
        this.a = yz0;
    }

    public final void onFeatureEnabledChanged(u61 u61, boolean z) {
        Object value;
        super.onFeatureEnabledChanged(u61, z);
        if (u61 == u61.b) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, "CallAdminSettingsController", ey8.j("Record in call was changed for me to ", z), (Throwable) null);
            }
            q0e q0e = this.a.E0;
            do {
                value = q0e.getValue();
            } while (!q0e.c(value, aa.a((aa) value, false, false, false, false, z, false, 111)));
        }
    }

    public final void onFeatureRolesChanged(u61 u61, FeatureRoles featureRoles) {
        Object value;
        super.onFeatureRolesChanged(u61, featureRoles);
        if (u61 == u61.b) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                ir6.d(us7, "CallAdminSettingsController", "Record in call was changed for role=" + featureRoles, (Throwable) null);
            }
            boolean z = featureRoles instanceof FeatureRoles.EnabledForAll;
            q0e q0e = this.a.E0;
            do {
                value = q0e.getValue();
            } while (!q0e.c(value, aa.a((aa) value, false, false, false, false, z, false, 111)));
            Conversation a2 = this.a.d().a();
            if (a2 != null ? a2.isMeCreatorOrAdmin() : false) {
                this.a.C0.g(new cb(z));
            }
        }
    }
}
