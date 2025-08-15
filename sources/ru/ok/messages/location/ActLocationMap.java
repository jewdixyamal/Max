package ru.ok.messages.location;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;

public class ActLocationMap extends q5 implements w46 {
    public static final /* synthetic */ int U0 = 0;

    public final String Z() {
        return null;
    }

    public final void c0(int i, int i2, Intent intent) {
        a E = S().E("ru.ok.messages.location.FrgLocationMap");
        if (E instanceof FrgLocationMap) {
            ((FrgLocationMap) E).l1(i, i2, intent);
        }
    }

    public final void d() {
        a E = S().E("ru.ok.messages.location.FrgLocationMap");
        if (E instanceof FrgLocationMap) {
            ((FrgLocationMap) E).d();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(yyb.act_single_fragment);
        f0(this.N0.L);
        if (bundle == null) {
            Intent intent = getIntent();
            long longExtra = intent.getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0);
            long longExtra2 = intent.getLongExtra("ru.ok.tamtam.extra.MESSAGE_ID", 0);
            long longExtra3 = intent.getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0);
            er7 er7 = (er7) intent.getSerializableExtra("ru.ok.tamtam.extra.LOCATION");
            if (er7 == null) {
                er7 = er7.Z;
            }
            float floatExtra = intent.getFloatExtra("ru.ok.tamtam.extra.ZOOM", 14.0f);
            boolean booleanExtra = intent.getBooleanExtra("ru.ok.tamtam.extra.LIVE", false);
            float f = floatExtra;
            long longExtra4 = intent.getLongExtra("ru.ok.tamtam.extra.DATE", 0);
            long longExtra5 = intent.getLongExtra("map:REQUEST_MESSAGE_ID", 0);
            boolean booleanExtra2 = intent.getBooleanExtra("ru.ok.tamtam.extra.ACTIVE", false);
            String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.DEVICE_ID");
            boolean booleanExtra3 = intent.getBooleanExtra("map:DISABLE_LIVE", false);
            boolean booleanExtra4 = intent.getBooleanExtra("map:REGULAR_SENDING", true);
            FrgLocationMap frgLocationMap = new FrgLocationMap();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("ru.ok.tamtam.extra.CHAT_ID", longExtra);
            bundle2.putLong("ru.ok.tamtam.extra.MESSAGE_ID", longExtra2);
            bundle2.putLong("ru.ok.tamtam.extra.CONTACT_ID", longExtra3);
            bundle2.putSerializable("ru.ok.tamtam.extra.LOCATION", er7);
            bundle2.putFloat("ru.ok.tamtam.extra.ZOOM", f);
            bundle2.putBoolean("ru.ok.tamtam.extra.LIVE", booleanExtra);
            bundle2.putLong("ru.ok.tamtam.extra.DATE", longExtra4);
            bundle2.putLong("ru.ok.tamtam.extra.REQUEST_MESSAGE_ID", longExtra5);
            bundle2.putBoolean("ru.ok.tamtam.extra.ACTIVE", booleanExtra2);
            bundle2.putString("ru.ok.tamtam.extra.DEVICE_ID", stringExtra);
            bundle2.putBoolean("ru.ok.tamtam.extra.DISABLE_LIVE", booleanExtra3);
            bundle2.putBoolean("ru.ok.tamtam.extra.REGULAR_SENDING", booleanExtra4);
            frgLocationMap.X0(bundle2);
            dy7.e(S(), xxb.act_single_fragment__container, frgLocationMap, "ru.ok.messages.location.FrgLocationMap");
        }
    }

    public final void v() {
        a E = S().E("ru.ok.messages.location.FrgLocationMap");
        if (E instanceof FrgLocationMap) {
            ((FrgLocationMap) E).getClass();
        }
    }

    public final void x() {
        a E = S().E("ru.ok.messages.location.FrgLocationMap");
        if (E instanceof FrgLocationMap) {
            ((FrgLocationMap) E).getClass();
        }
    }
}
