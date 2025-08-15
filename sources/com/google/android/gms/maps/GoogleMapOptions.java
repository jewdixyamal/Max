package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new vqf(18);
    public static final Integer F0 = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public LatLngBounds A0 = null;
    public Boolean B0;
    public Integer C0 = null;
    public String D0 = null;
    public int E0;
    public Boolean X;
    public Boolean Y;
    public Boolean Z;
    public Boolean a;
    public Boolean b;
    public int c = -1;
    public CameraPosition o;
    public Boolean s0;
    public Boolean t0;
    public Boolean u0;
    public Boolean v0;
    public Boolean w0;
    public Boolean x0;
    public Float y0 = null;
    public Float z0 = null;

    public static GoogleMapOptions b(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, y2c.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(y2c.MapAttrs_mapType)) {
            googleMapOptions.c = obtainAttributes.getInt(y2c.MapAttrs_mapType, -1);
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_zOrderOnTop)) {
            googleMapOptions.a = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_useViewLifecycle)) {
            googleMapOptions.b = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_uiCompass)) {
            googleMapOptions.Y = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_uiRotateGestures)) {
            googleMapOptions.u0 = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.B0 = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_uiScrollGestures)) {
            googleMapOptions.Z = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_uiTiltGestures)) {
            googleMapOptions.t0 = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_uiZoomGestures)) {
            googleMapOptions.s0 = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_uiZoomControls)) {
            googleMapOptions.X = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_liteMode)) {
            googleMapOptions.v0 = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_uiMapToolbar)) {
            googleMapOptions.w0 = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_ambientEnabled)) {
            googleMapOptions.x0 = Boolean.valueOf(obtainAttributes.getBoolean(y2c.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.y0 = Float.valueOf(obtainAttributes.getFloat(y2c.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.z0 = Float.valueOf(obtainAttributes.getFloat(y2c.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_backgroundColor)) {
            googleMapOptions.C0 = Integer.valueOf(obtainAttributes.getColor(y2c.MapAttrs_backgroundColor, F0.intValue()));
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_mapId) && (string = obtainAttributes.getString(y2c.MapAttrs_mapId)) != null && !string.isEmpty()) {
            googleMapOptions.D0 = string;
        }
        if (obtainAttributes.hasValue(y2c.MapAttrs_mapColorScheme)) {
            googleMapOptions.E0 = obtainAttributes.getInt(y2c.MapAttrs_mapColorScheme, 0);
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, y2c.MapAttrs);
        float f = 0.0f;
        Float valueOf = obtainAttributes2.hasValue(y2c.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes2.getFloat(y2c.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes2.hasValue(y2c.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes2.getFloat(y2c.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes2.hasValue(y2c.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes2.getFloat(y2c.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes2.hasValue(y2c.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes2.getFloat(y2c.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        obtainAttributes2.recycle();
        if (!(valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null)) {
            latLngBounds = new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
        }
        googleMapOptions.A0 = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, y2c.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes3.hasValue(y2c.MapAttrs_cameraTargetLat) ? obtainAttributes3.getFloat(y2c.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes3.hasValue(y2c.MapAttrs_cameraTargetLng) ? obtainAttributes3.getFloat(y2c.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        float f2 = obtainAttributes3.hasValue(y2c.MapAttrs_cameraZoom) ? obtainAttributes3.getFloat(y2c.MapAttrs_cameraZoom, 0.0f) : 0.0f;
        float f3 = obtainAttributes3.hasValue(y2c.MapAttrs_cameraBearing) ? obtainAttributes3.getFloat(y2c.MapAttrs_cameraBearing, 0.0f) : 0.0f;
        if (obtainAttributes3.hasValue(y2c.MapAttrs_cameraTilt)) {
            f = obtainAttributes3.getFloat(y2c.MapAttrs_cameraTilt, 0.0f);
        }
        obtainAttributes3.recycle();
        googleMapOptions.o = new CameraPosition(latLng, f2, f, f3);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        qz7 qz7 = new qz7((Object) this);
        qz7.h(Integer.valueOf(this.c), "MapType");
        qz7.h(this.v0, "LiteMode");
        qz7.h(this.o, "Camera");
        qz7.h(this.Y, "CompassEnabled");
        qz7.h(this.X, "ZoomControlsEnabled");
        qz7.h(this.Z, "ScrollGesturesEnabled");
        qz7.h(this.s0, "ZoomGesturesEnabled");
        qz7.h(this.t0, "TiltGesturesEnabled");
        qz7.h(this.u0, "RotateGesturesEnabled");
        qz7.h(this.B0, "ScrollGesturesEnabledDuringRotateOrZoom");
        qz7.h(this.w0, "MapToolbarEnabled");
        qz7.h(this.x0, "AmbientEnabled");
        qz7.h(this.y0, "MinZoomPreference");
        qz7.h(this.z0, "MaxZoomPreference");
        qz7.h(this.C0, "BackgroundColor");
        qz7.h(this.A0, "LatLngBoundsForCameraTarget");
        qz7.h(this.a, "ZOrderOnTop");
        qz7.h(this.b, "UseViewLifecycleInFragment");
        qz7.h(Integer.valueOf(this.E0), "mapColorScheme");
        return qz7.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        byte e0 = br7.e0(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(e0);
        byte e02 = br7.e0(this.b);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(e02);
        int i2 = this.c;
        ay7.X(parcel, 4, 4);
        parcel.writeInt(i2);
        ay7.P(parcel, 5, this.o, i);
        byte e03 = br7.e0(this.X);
        ay7.X(parcel, 6, 4);
        parcel.writeInt(e03);
        byte e04 = br7.e0(this.Y);
        ay7.X(parcel, 7, 4);
        parcel.writeInt(e04);
        byte e05 = br7.e0(this.Z);
        ay7.X(parcel, 8, 4);
        parcel.writeInt(e05);
        byte e06 = br7.e0(this.s0);
        ay7.X(parcel, 9, 4);
        parcel.writeInt(e06);
        byte e07 = br7.e0(this.t0);
        ay7.X(parcel, 10, 4);
        parcel.writeInt(e07);
        byte e08 = br7.e0(this.u0);
        ay7.X(parcel, 11, 4);
        parcel.writeInt(e08);
        byte e09 = br7.e0(this.v0);
        ay7.X(parcel, 12, 4);
        parcel.writeInt(e09);
        byte e010 = br7.e0(this.w0);
        ay7.X(parcel, 14, 4);
        parcel.writeInt(e010);
        byte e011 = br7.e0(this.x0);
        ay7.X(parcel, 15, 4);
        parcel.writeInt(e011);
        ay7.N(parcel, 16, this.y0);
        ay7.N(parcel, 17, this.z0);
        ay7.P(parcel, 18, this.A0, i);
        byte e012 = br7.e0(this.B0);
        ay7.X(parcel, 19, 4);
        parcel.writeInt(e012);
        Integer num = this.C0;
        if (num != null) {
            ay7.X(parcel, 20, 4);
            parcel.writeInt(num.intValue());
        }
        ay7.Q(parcel, 21, this.D0);
        int i3 = this.E0;
        ay7.X(parcel, 23, 4);
        parcel.writeInt(i3);
        ay7.W(parcel, T);
    }
}
