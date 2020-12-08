import { Hour } from './hour';
import { Admission } from './admission';

export class Museum {
    id: number;
    name: string;
    address: string;
    country: string;
    website: string;
    phone: string;
    image_link: string;
    hours: Hour[];
    admissionRate: Admission[];
}
