package com.xch.websock.arcgistool;

import android.content.Context;
import android.widget.LinearLayout;

import com.esri.arcgisruntime.mapping.view.MapView;

/**
 * Author:xch
 * Date:2019/5/9
 * Description:
 */
public class ArcgisView extends LinearLayout {

    private MapView mapView;
    public ArcgisView(Context context) {
        super(context);
    }

    private void initView(Context ctx) {
        mapView = new MapView(ctx);

        addView(mapView);
    }
}
