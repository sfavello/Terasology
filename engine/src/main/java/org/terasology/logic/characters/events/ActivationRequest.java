/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.logic.characters.events;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.network.NetworkEvent;
import org.terasology.network.ServerEvent;

import javax.vecmath.Vector3f;

/**
 * @author Florian <florian@fkoeberle.de>
 */
@ServerEvent(lagCompensate = true)
public class ActivationRequest extends NetworkEvent {
    private EntityRef instigator;
    private EntityRef target;
    private Vector3f origin;
    private Vector3f direction;
    private Vector3f hitPosition;
    private Vector3f hitNormal;

    public ActivationRequest() {
    }

    public ActivationRequest(EntityRef target, EntityRef instigator, Vector3f origin, Vector3f direction, Vector3f hitPosition, Vector3f hitNormal) {
        this.instigator = instigator;
        this.target = target;
        this.direction = direction;
        this.hitPosition = hitPosition;
        this.hitNormal = hitNormal;
        this.origin = origin;
    }

    @Override
    public EntityRef getInstigator() {
        return instigator;
    }

    public EntityRef getTarget() {
        return target;
    }

    public Vector3f getOrigin() {
        return origin;
    }

    public Vector3f getDirection() {
        return direction;
    }

    public Vector3f getHitPosition() {
        return hitPosition;
    }

    public Vector3f getHitNormal() {
        return hitNormal;
    }
}
