import requests
data = requests.get("https://www.amazon.in/Wesley-Briefcase-Professional-Messenger-Resistant/dp/B08K7PN23C/ref=pd_ci_mcx_mh_mcx_views_0_image?pd_rd_w=9SPaA&content-id=amzn1.sym.fa0aca50-60f7-47ca-a90e-c40e2f4b46a9%3Aamzn1.symc.ca948091-a64d-450e-86d7-c161ca33337b&pf_rd_p=fa0aca50-60f7-47ca-a90e-c40e2f4b46a9&pf_rd_r=0YQJ854F8BASDC5NVG19&pd_rd_wg=R06Lx&pd_rd_r=15813b55-6102-41ba-a587-a5011877be42&pd_rd_i=B08K7PN23C")

print(data.json())