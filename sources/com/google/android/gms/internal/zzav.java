package com.google.android.gms.internal;

public final class zzav {
    public static int zzd(int i) {
        if (i != 1000) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder(43);
                    stringBuilder.append(i);
                    stringBuilder.append(" is not a valid enum EnumBoolean");
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return i;
    }
}
