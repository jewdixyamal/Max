package ru.ok.android.externcalls.sdk.id;

public class CallExternalIdConverter {
    private CallExternalIdConverter() {
    }

    public static ParticipantId convert(o61 o61) {
        if (o61 == null) {
            return null;
        }
        return new ParticipantId(o61.a, o61.b == 3, o61.c);
    }
}
