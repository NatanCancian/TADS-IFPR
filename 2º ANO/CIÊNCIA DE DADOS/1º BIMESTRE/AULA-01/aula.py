from tqdm import tqdm
from time import sleep

print("Aguardando...")
for i in tqdm(range(11)):
    sleep(1)

print("Acabou")